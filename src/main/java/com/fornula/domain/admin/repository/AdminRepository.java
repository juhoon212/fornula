<<<<<<< HEAD
package com.fornula.domain.admin.repository;

import java.util.List;

import com.fornula.domain.admin.dto.AdminItem;
import com.fornula.domain.admin.dto.AdminMember;

public interface AdminRepository {


//	int findId(Member member); 
//	int status(Member member);
	
	List<AdminMember> memberList();
	List<AdminItem> itemList();
}
=======
package com.fornula.domain.admin.repository;

import java.util.List;

import com.fornula.domain.admin.dto.AdminItem;
import com.fornula.domain.admin.dto.AdminMember;

public interface AdminRepository {


//	int findId(Member member); 
//	int status(Member member);
	
	List<AdminMember> memberList();
	List<AdminItem> itemList();
}
>>>>>>> branch 'main' of https://github.com/juhoon212/fornula.git