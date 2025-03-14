package test.statement.If;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.StringReader;

import org.junit.Before;
import org.junit.Test;

import compiler.ParseException;
import compiler.Rando;

public class IfElseIfTest2 {

	Rando parser;
	
	@Before
	public void setUp() throws Exception {
		StringReader reader = new StringReader("Fillim   Nqs ( false ) Atehere Fillim Shkruaj 1  Shkruaj 2 Fund PerndrysheNqs (true ) Atehere Fillim Shkruaj 1 Shkruaj 2 Fund  Fund");
		parser=new Rando(reader);
	}
	

	@Test
	public void test() throws ParseException
	{
        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        parser.Start();
        assertEquals("12", outContent.toString());
		
	}
}
