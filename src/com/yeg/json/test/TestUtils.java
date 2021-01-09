package com.yeg.json.test;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.yeg.json.model.AccountBean;
import com.yeg.json.model.Birthday;
import com.yeg.json.model.Cif;
import com.yeg.json.model.Cif2;
import com.yeg.json.model.Cif3;
import com.yeg.json.model.CifStar;
import com.yeg.json.model.Person;
import com.yeg.json.model.User;

public class TestUtils {

	public static AccountBean createAccountBean() {
		Birthday birthday = new Birthday("1982-09-09");

		AccountBean ab = new AccountBean();
		ab.setId(1);
		ab.setName("青山一点红");
		ab.setBirthday(birthday);
		ab.setEmail("yuaneg@qq.com");
		ab.setAddress("北京市昌平区");

		return ab;
	}

	public static Map<String, Object> createMap() {

		Map<String, Object> map = new HashMap<String, Object>();
		map.put("name", "张三");
		map.put("account", createAccountBean());
		// map.put("account2", createAccountBean());

		return map;
	}

	public static List<AccountBean> createList() {

		AccountBean ab = createAccountBean();

		List<AccountBean> list = new ArrayList<AccountBean>();
		list.add(ab);

		ab = createAccountBean();
		ab.setId(2);
		ab.setName("海中金");
		ab.setEmail("haizhongjin@qq.com");
		ab.setAddress("大海之中一粒沙");

		list.add(ab);

		return list;
	}

	public static User createUser() {

		User user = new User();
		user.setId(9999);
		user.setName("青山一点红");
		user.setBirthday(new Date());
		user.setEmail("yuaneg@qq.com");
		user.setAddress("北京市昌平区");

		user.setDepository(999.999);

		return user;
	}

	public static Person createPerson() {

		Person user = new Person();
		user.setId(9999);
		user.setName("青山一点红");
		user.setBirthday(new Date());
		user.setEmail("yuaneg@qq.com");
		user.setAddress("北京市昌平区");

		user.setDepository(999.999);

		return user;
	}

	public static Cif createCif() {

		Cif cif = new Cif();

		cif.setId(9999);
		cif.setName("青山一点红");
		cif.setBirthday(new Date());

		cif.setEmail("yuaneg@qq.com");
		cif.setAddress("北京市昌平区");
		cif.setDepository(6666.66);

		return cif;
	}

	public static Cif2 createCif2() {

		Cif2 cif2 = new Cif2();

		cif2.setId(9999);
		cif2.setName("青山一点红");
		cif2.setBirthday(new Date());

		cif2.setEmail("yuaneg@qq.com");
		cif2.setAddress("北京市昌平区");
		cif2.setDepository(6666.66);

		return cif2;
	}

	public static Cif3 createCif3() {

		Cif3 cif3 = new Cif3();

		cif3.setId(9999);
		cif3.setName("青山一点红");
		cif3.setBirthday(new Date());

		cif3.setEmail("yuaneg@qq.com");
		cif3.setAddress("北京市昌平区");
		cif3.setDepository(6666.66);

		CifStar cifStar = new CifStar();
		cifStar.setDesc("超级VIP");
		cifStar.setNum(9);
		cifStar.setStarId(123);

		cif3.setCifStar(cifStar);

		return cif3;
	}

}
