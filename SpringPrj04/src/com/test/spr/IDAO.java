/*======================
 * 	IDAO.java
 *  - 인터페이스
 =====================*/

package com.test.spr;

import java.sql.SQLException;
import java.util.List;

public interface IDAO
{
	// (추상) 메소드 선언   // 인터페이스이기 때문에 abstract 명시하지 않는다.
	public List<MemberDTO> list() throws ClassNotFoundException, SQLException;
	
	
}
