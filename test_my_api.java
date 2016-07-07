
import my_pkg.my_api;

public class test_my_api
{
	static public void main (String args[])
	{
		my_api api = new my_api();
		int log_filesize = 102400;
		String log_filename = "001.log";
		String fmt = "format";
		api.log(log_filename, log_filesize, fmt);
		//System.out.printf("test\n");
	}
}
