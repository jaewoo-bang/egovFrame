package com.example.demo.user.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import lombok.Data;

@Data
public class UserVO implements UserDetails {
	private Long id;
	private String loginId;
	private String password;
	private String fullName;
	private String deptName;
	private List<String> role;
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		List<GrantedAuthority> list = new ArrayList<>();
		for(String r : role) {
			list.add(new SimpleGrantedAuthority(r));
		}
		return list;
	}
	@Override
	public String getUsername() {
		return loginId;
	}
	@Override
	public boolean isAccountNonExpired() {
		return true;
	}
	@Override
	public boolean isAccountNonLocked() {
		return true;
	}
	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}
	@Override
	public boolean isEnabled() {
		return true;
	}
//	Java에서 클래스를 만든다는 건 “물건 설계도”를 만드는 것
//	class Car {
//	    String color;
//	    int speed;
//	}
	
//	이건 **“Car라는 설계도”**만 만든 거예요.
//	아직 진짜 자동차는 없습니다.
//	설계도로 자동차를 만들 때는 new를 써요 👇
//
//	Car myCar = new Car();
//
//
//	이 순간 **“Car라는 객체(물건)”**이 하나 만들어집니다.
//	근데 방금 만든 자동차는 색깔이 없고 속도도 0이에요.
	
//	 3. “생성자”는 객체를 만들면서 값도 넣는 기능이에요
//
//	지금은 이렇게 따로 써야 하죠:
//
//	myCar.color = "red";
//	myCar.speed = 100;
//
//
//	그런데 생성자를 만들면 객체를 만들 때 바로 넣을 수 있습니다 👇
//
//	class Car {
//	    String color;
//	    int speed;
//
//	    // 이게 생성자!
//	    Car(String c, int s) {
//	        color = c;
//	        speed = s;
//	    }
//	}
//
//
//	이제는 이렇게 쓸 수 있어요 👇
//
//	Car myCar = new Car("red", 100);
//
//
//	👉 즉, “생성자”는 객체가 만들어질 때 처음 값을 정해주는 함수입니다.

}
