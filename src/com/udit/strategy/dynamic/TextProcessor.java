package com.udit.strategy.dynamic;

import java.util.List;

import com.udit.strategy.HTMLListStrategy;
import com.udit.strategy.ListStrategy;
import com.udit.strategy.MarkDownListStrategy;
import com.udit.strategy.OutputFormat;

public class TextProcessor {

	private StringBuffer sb;
	private OutputFormat format;
	private ListStrategy strategy;

	public TextProcessor(OutputFormat format) {
		this.sb = new StringBuffer();
		setOutputFormat(format);
	}

	public void setOutputFormat(OutputFormat format) {
		this.format = format;
		switch (this.format) {
		case HTML:
			this.strategy = new HTMLListStrategy();
			break;
		case MARKDOWN:
			this.strategy = new MarkDownListStrategy();
			break;
		}
	}

	public void appendList(List<String> items) {
		strategy.start(sb);
		items.forEach(item -> strategy.addListItem(item, sb));
		strategy.end(sb);
	}

	public void clear() {
		sb.setLength(0);
	}

	@Override
	public String toString() {
		return sb.toString();
	}
}
