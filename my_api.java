package my_pkg;

import java.io.File;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.IOException;
import java.util.Date;
import java.text.MessageFormat;

public class my_api
{
	private String version;
	public my_api ()
	{
		version = "1.0.0";
	}
	public int log (String log_filename, int log_filesize, String format)
	{
		int cur_src_line = 0;
		int prev_src_line = 0;
		String cur_src_filename = "";
		String prev_src_filename = "";
		//
		cur_src_line      = Thread.currentThread().getStackTrace()[1].getLineNumber();
		cur_src_filename  = Thread.currentThread().getStackTrace()[1].getFileName();
		prev_src_line     = Thread.currentThread().getStackTrace()[2].getLineNumber();
		prev_src_filename = Thread.currentThread().getStackTrace()[2].getFileName();
		//
		File file;
		try 
		{
			// open file
			file = new File(log_filename);
			if (file.createNewFile())
			{
				System.out.println("info: create new file : " + log_filename);
			}
			else
			{
				System.out.println("info: open exist file : " + log_filename);
			}
			// file size
			System.out.println("info: file size : " + file.length());
		}
		catch (IOException ioe)
		{
			ioe.printStackTrace();
		}
		//
		//System.out.println("my_api.log   : " + version);
		//System.out.println("[0] : " + cur_src_filename + " " + cur_src_line);
		//System.out.println("[1] : " + prev_src_filename + " " + prev_src_line);
		//
		//String head;
		//String tail;
		//head = String.format("%s %d", prev_src_filename, prev_src_line);
		//tail = String.format(format, args);
		//System.out.println("head : " + head);
		//System.out.println("tail : " + tail);
		//System.out.println(PrintStream(format, args));
		return 0;
	}
	public static String format_func (String fmt, Object ... arguments)
	{
		String result = MessageFormat.format(
				"At {1,time} on {1,date}, there was {2} on planet "
				+ "{0,number,integer}.",
				7, new Date(), "a disturbance in the Force");
		System.out.println(result);
		return result;
	}
}
