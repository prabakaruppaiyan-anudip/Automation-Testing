package basics;
class PA
{
	private String uname;
    private String pwd;
    PA()
    {
   	 uname="Praba";
   	 pwd="praba123";
   	 
    }
    void setter(String pwd)
    {
    	
    	this.pwd=pwd;
    }
    String getter()
    {
    	return pwd;
    }
     
}

public class PrivateAccess {
    public static void main(String[] args) {
       	PA p=new PA();
       	p.setter("vanitha123");
       	String updated_pwd=p.getter();
       	

	}
	

}
