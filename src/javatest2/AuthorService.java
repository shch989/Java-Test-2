package javatest2;

public interface AuthorService {

	public void authorGetList(String cri);
	public void authorGetTotal(String cri);
	public void authorGetDetail(int authorId);
	public void authorModify(String author);
	public void authorDelete(int authorId);
	
}
