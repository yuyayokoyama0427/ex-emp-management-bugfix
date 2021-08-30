package jp.co.sample.emp_management.form;

/**
 * 従業員曖昧検索をするフォーム.
 * 
 * @author yuyayokoyama
 *
 */
public class FindEmployee {
	/** 従業員名 */
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "FindEmployee [name=" + name + "]";
	}
	
	

}
