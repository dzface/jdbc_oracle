package kh_jdbc.vo;

import java.math.BigDecimal;
import java.sql.Date;

// VO는 데이터베이스에서 가져온 래코드를 자바 객체로 매핑하는데 사용
// 데이터 받기만 하고 수정하면 안됨
public class EmpVo {
    private int empNo; // 사원번호
    private String name; // 사원이름
    private String job; // 직책
    private int mgr; // 상관직책 번호
    private Date date; // 입사 년도
    private BigDecimal sal; // 급여정보이고, 실수가 존재함 자바에서 데이터 타입으로 BigDecimal 사용이 권장됨
    private BigDecimal comm;// 상여금
    private int deptNO;
    public EmpVo(int empNo, String name, String job, int mgr, Date date, BigDecimal sal, BigDecimal comm, int deptNO) {
        this.empNo = empNo;
        this.name = name;
        this.job = job;
        this.mgr = mgr;
        this.date = date;
        this.sal = sal;
        this.comm = comm;
        this.deptNO = deptNO;
    }

    public int getEmpNo() {
        return empNo;
    }

    public void setEmpNo(int empNo) {
        this.empNo = empNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getMgr() {
        return mgr;
    }

    public void setMgr(int mgr) {
        this.mgr = mgr;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public BigDecimal getSal() {
        return sal;
    }

    public void setSal(BigDecimal sal) {
        this.sal = sal;
    }

    public BigDecimal getComm() {
        return comm;
    }

    public void setComm(BigDecimal comm) {
        this.comm = comm;
    }

    public int getDeptNO() {
        return deptNO;
    }

    public void setDeptNO(int deptNO) {
        this.deptNO = deptNO;
    }
}
