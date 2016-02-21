package edu.umsl.grad.advisor.tree;

import java.util.List;

public class OrClause {
	List<AndClause> data;
	
	public List<AndClause> getData() {
		return data;
	}

	public void setData(List<AndClause> data) {
		this.data = data;
	}
}
