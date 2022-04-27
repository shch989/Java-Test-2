package javatest2;

public class Criteria {
	
	private int pageNum;
	private int amount;
	private String type;
	private String keyword;
	private String[] authorArr;
	private String cateCode;
	private int bookId;
	
	
	public int getPageNum() {
		return pageNum;
	}
	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getKeyword() {
		return keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	public String[] getAuthorArr() {
		return authorArr;
	}
	public void setAuthorArr(String[] authorArr) {
		this.authorArr = authorArr;
	}
	public String getCateCode() {
		return cateCode;
	}
	public void setCateCode(String cateCode) {
		this.cateCode = cateCode;
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	
	
	public void hello() {
		System.out.println("기본생성자 입니다.");
	}
	public void byebye(int pageNum, int amount) {
		System.out.println("pageNum : " + pageNum);
		System.out.println("amount : " + amount);
	}
}
