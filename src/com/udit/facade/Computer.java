package com.udit.facade;

public class Computer {

	private CPU cpu;
	private HardDrive hdd;
	private Memory ram;

	private static int BOOT_ADDRESS = 100;
	private static int BOOT_SECTOR = 4000;
	private static int SECTOR_SIZE = 500;

	public Computer() {
		this.cpu = new CPU();
		this.hdd = new HardDrive();
		this.ram = new Memory();
	}

	public CPU getCpu() {
		return cpu;
	}

	public void setCpu(CPU cpu) {
		this.cpu = cpu;
	}

	public HardDrive getHdd() {
		return hdd;
	}

	public void setHdd(HardDrive hdd) {
		this.hdd = hdd;
	}

	public Memory getMemory() {
		return ram;
	}

	public void setMemory(Memory memory) {
		this.ram = memory;
	}

	/**
	 * Here, all low level work is happening
	 */
	public void start() {
		cpu.freeze();
		ram.load(BOOT_ADDRESS, hdd.read(BOOT_SECTOR, SECTOR_SIZE));
		cpu.jump(BOOT_ADDRESS);
		cpu.execute();
	}

}
