package com.wlf.springcloud.entity;

import java.io.Serializable;

/**
 * @author LifengWang
 * @create 2020-06-21  2:26
 */
@SuppressWarnings("serial")
public class Dept  implements Serializable{
    private Long 	deptno; // 主键
    private String 	dname; // 部门名称
    private String 	db_source;// 来自那个数据库，因为微服务架构可以一个服务对应一个数据库，同一个信息被存储到不同数据库




    @Override
    public String toString() {
        return "Dept [deptno=" + deptno + ", dname=" + dname + ", db_source=" + db_source + "]";
    }
    public Dept() {
        super();
    }
    public Dept(Long deptno, String dname, String db_source) {
        super();
        this.deptno = deptno;
        this.dname = dname;
        this.db_source = db_source;
    }
    public Long getDeptno() {
        return deptno;
    }
    public void setDeptno(Long deptno) {
        this.deptno = deptno;
    }
    public String getDname() {
        return dname;
    }
    public void setDname(String dname) {
        this.dname = dname;
    }
    public String getDb_source() {
        return db_source;
    }
    public void setDb_source(String db_source) {
        this.db_source = db_source;
    }
}
