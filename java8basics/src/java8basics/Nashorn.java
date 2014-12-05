package java8basics;
import java.io.FileNotFoundException;
import java.io.FileReader;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class Nashorn {

	public static void main(String[] args) {
		ScriptEngine engine = new ScriptEngineManager()
				.getEngineByName("nashorn");
		try {
			engine.eval("print('Hello World!');");
		} catch (ScriptException e) {
			e.printStackTrace();
		}

		callScriptFunction();
	}

	public static void callScriptFunction() {

		ScriptEngine engine = new ScriptEngineManager()
				.getEngineByName("nashorn");
		try {
			engine.eval(new FileReader("script.js"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ScriptException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Invocable invocable = (Invocable) engine;

		Object result = null;
		try {
			result = invocable.invokeFunction("fun1", "Peter Parker");
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (ScriptException e) {
			e.printStackTrace();
		}
		System.out.println(result);
		System.out.println(result.getClass());

		try {
			result = invocable.invokeFunction("fun3");
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (ScriptException e) {
			e.printStackTrace();
		}
		System.out.println(result);
		System.out.println(result.getClass());

		try {
			result = invocable.invokeFunction("fun4", "its Balendra");
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (ScriptException e) {
			e.printStackTrace();
		}
	}

	public static String fun1(String name) {
		System.out.println("Hi there from Java " + name);
		return "greetings from java" + name;
	}
}
