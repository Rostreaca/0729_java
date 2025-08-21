package com.kh.chap03.model.vo;

import java.util.Objects;

public class MBTI {
	
	private String introversionExtroversion;
	private String sensingiNtution;
	private String thikingFeeling;
	private String judgingPerceiving;
	
	
	public MBTI() {
		super();
	}


	public MBTI(String introversionExtroversion, String sensingiNtution, String thikingFeeling,
			String judgingPerceiving) {
		super();
		this.introversionExtroversion = introversionExtroversion;
		this.sensingiNtution = sensingiNtution;
		this.thikingFeeling = thikingFeeling;
		this.judgingPerceiving = judgingPerceiving;
	}


	public String getIntroversionExtroversion() {
		return introversionExtroversion;
	}


	public void setIntroversionExtroversion(String introversionExtroversion) {
		this.introversionExtroversion = introversionExtroversion;
	}


	public String getSensingiNtution() {
		return sensingiNtution;
	}


	public void setSensingiNtution(String sensingiNtution) {
		this.sensingiNtution = sensingiNtution;
	}


	public String getThikingFeeling() {
		return thikingFeeling;
	}


	public void setThikingFeeling(String thikingFeeling) {
		this.thikingFeeling = thikingFeeling;
	}


	public String getJudgingPerceiving() {
		return judgingPerceiving;
	}


	public void setJudgingPerceiving(String judgingPerceiving) {
		this.judgingPerceiving = judgingPerceiving;
	}


	@Override
	public String toString() {
		return "MBTI [introversionExtroversion=" + introversionExtroversion + ", sensingiNtution=" + sensingiNtution
				+ ", thikingFeeling=" + thikingFeeling + ", judgingPerceiving=" + judgingPerceiving + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(introversionExtroversion, judgingPerceiving, sensingiNtution, thikingFeeling);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MBTI other = (MBTI) obj;
		return Objects.equals(introversionExtroversion, other.introversionExtroversion)
				&& Objects.equals(judgingPerceiving, other.judgingPerceiving)
				&& Objects.equals(sensingiNtution, other.sensingiNtution)
				&& Objects.equals(thikingFeeling, other.thikingFeeling);
	}
}
	// 결론적으로 우리가 해야할 일
	// 필드의 값이 동일하다면
	// equals() 와 hashCode()를 오버라이딩해서 동일한 결과값이 출력되도록 구현해야함
	
//
//	@Override
//	public boolean equals(Object obj) {
//		MBTI mbti = (MBTI)obj;
//		// 필드값 비교
//		// ei, sn, tf, jp 넷 중 하나라도 다르면 false를 반환
//		// 내필드랑 매개변수로 받아온애 필드
//		if(!this.introversionExtroversion.equals(mbti.introversionExtroversion)||
//			!this.sensingiNtution.equals(mbti.sensingiNtution)||
//			!this.thikingFeeling.equals(mbti.thikingFeeling)||
//			!this.judgingPerceiving.equals(mbti.judgingPerceiving)) {
//			
//			return false;
//			
//		}
//		return true;			
//	}
//	
//	@Override
//	public int hashCode() {
//		//객체를 가지고 뭐 알아서 10진수로 만들어서 반환
//		// 필드값 똑같으면 똑같은 해시코드가 나오게하고싶다.
//		/*
//		String isfj = "I" +"S"+"F"+"J";
//		isfj.toString().hashCode();
//		"isfj".toString().hashCode();
//		*/
//		return(introversionExtroversion + sensingiNtution 
//				+ thikingFeeling + judgingPerceiving).hashCode();
//		
//	}
//}
	
