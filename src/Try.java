import java.io.*;



public class Try {

	
	public static void read()
	{
		InputStream ins = null; // raw byte-stream
		Reader r = null; // cooked reader
		BufferedReader br = null; // buffered for readLine()
		try {
		    String s;
		    if (true) {
		        ins = new FileInputStream("C:/Eclipse/workspace/Test/src/input.txt");
		      
		    } else {
		    
		        String data = "#foobar\t1234\n#xyz\t5678\none\ttwo\n";
		        ins = new ByteArrayInputStream(data.getBytes());
		    }
		    r = new InputStreamReader(ins, "UTF-8"); // leave charset out for default
		    br = new BufferedReader(r);
		    while ((s = br.readLine()) != null) {
		        System.out.println(s);
		    }
		}
		catch (Exception e)
		{
		    System.err.println(e.getMessage()); // handle exception
		}
		finally {
		    if (br != null) { try { br.close(); } catch(Throwable t) { /* ensure close happens */ } }
		    if (r != null) { try { r.close(); } catch(Throwable t) { /* ensure close happens */ } }
		    if (ins != null) { try { ins.close(); } catch(Throwable t) { /* ensure close happens */ } }
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Try.read();
		System.out.println("sd");
	}

}
