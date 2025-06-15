package jsondata;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.charset.Charset;

import org.json.JSONArray;
import org.json.JSONObject;

public class CreateJson {

	public static void main(String[] args) {
		//json객체 생성 - ("속성":속성값)
		JSONObject root = new JSONObject();
		System.out.println(root);
			
		//속성 추가
		root.put("id", "1234");
		root.put("name", "이하늘");
		root.put("age", "28");
		root.put("student", "true");
		
		//전화번호 속성 추가
		JSONObject tel = new JSONObject();
		tel.put("home","0231314");
		tel.put("mobile","0100231314");
		root.put("tel", tel);
		//배열 속성
		JSONArray skill = new JSONArray();
		skill.put("Java");
		skill.put("C");
		skill.put("C++");
		
		root.put("skill", skill);
	
		//저장한 root를 문자열로 생성
		String json = root.toString();
		System.out.println(json);
		
		//JSON 데이터를 파일로 저장
		try (Writer writer = new FileWriter("member.json",
				Charset.forName("utf-8"))){
			writer.write(json);
			writer.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
