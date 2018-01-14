package kr.co.infopub.chapter.s184.test;
import java.sql.SQLException;
import java.util.List;
import kr.co.infopub.chapter.s184.dto.EmployeeDto;
import kr.co.infopub.chapter.s184.model.EmployeeDAO;
public class EmployeeTest2 {
 public static void main(String[] args) {
	EmployeeDAO ddao=new EmployeeDAO();
	try {
		List<EmployeeDto> lists=ddao.findTreeManagerInEmployee();
		for (EmployeeDto dd: lists) {
			System.out.print(dd.getOrder2());
			System.out.println("\t\t"+dd.getFirstName()+" "+dd.getLastName());
		}
	} catch (SQLException e) {
		System.out.println( e);
	}
 }
}
/*
CRUD-------------------------------class sample.model.EmployeeDAO.findTreeManagerInEmployee()
SELECT 
  EMPLOYEE_ID, 
  MANAGER_ID, 
  FIRST_NAME, 
  LAST_NAME, DEPARTMENT_ID, ORDER2 
  FROM ( 	SELECT 
  EMPLOYEE_ID, 
  MANAGER_ID, 
  FIRST_NAME, 
  LAST_NAME, DEPARTMENT_ID, LEVEL , 
  SYS_CONNECT_BY_PATH(TO_CHAR(LEVEL,'FM000')||EMPLOYEE_ID,'/') ORDER2 
  FROM EMPLOYEES 
  START WITH  MANAGER_ID  IS NULL 
  CONNECT BY PRIOR  EMPLOYEE_ID = MANAGER_ID) 
  ORDER BY ORDER2
CRUD--------------------------------------2017-05-13 20:25
/001100
/001100/002101
/001100/002101/003108
/001100/002101/003108/004109
/001100/002101/003108/004110
/001100/002101/003108/004111
/001100/002101/003108/004112
/001100/002101/003108/004113
/001100/002101/003200
/001100/002101/003203
/001100/002101/003204
/001100/002101/003205
/001100/002101/003205/004206
/001100/002102
/001100/002102/003103
/001100/002102/003103/004104
/001100/002102/003103/004105
/001100/002102/003103/004106
/001100/002102/003103/004106/005207
/001100/002102/003103/004107
/001100/002114
/001100/002114/003115
/001100/002114/003116
/001100/002114/003117
/001100/002114/003118
/001100/002114/003119
/001100/002120
/001100/002120/003125
/001100/002120/003126
/001100/002120/003127
/001100/002120/003128
/001100/002120/003128/004318
/001100/002120/003180
/001100/002120/003181
/001100/002120/003182
/001100/002120/003183
/001100/002121
/001100/002121/003129
/001100/002121/003130
/001100/002121/003131
/001100/002121/003132
/001100/002121/003184
/001100/002121/003185
/001100/002121/003186
/001100/002121/003187
/001100/002122
/001100/002122/003133
/001100/002122/003134
/001100/002122/003135
/001100/002122/003136
/001100/002122/003188
/001100/002122/003189
/001100/002122/003190
/001100/002122/003191
/001100/002123
/001100/002123/003137
/001100/002123/003138
/001100/002123/003139
/001100/002123/003140
/001100/002123/003192
/001100/002123/003193
/001100/002123/003194
/001100/002123/003195
/001100/002124
/001100/002124/003141
/001100/002124/003142
/001100/002124/003143
/001100/002124/003144
/001100/002124/003196
/001100/002124/003197
/001100/002124/003198
/001100/002124/003199
/001100/002145
/001100/002145/003150
/001100/002145/003151
/001100/002145/003151/004325
/001100/002145/003152
/001100/002145/003153
/001100/002145/003154
/001100/002145/003155
/001100/002146
/001100/002146/003156
/001100/002146/003157
/001100/002146/003158
/001100/002146/003159
/001100/002146/003160
/001100/002146/003161
/001100/002147
/001100/002147/003162
/001100/002147/003163
/001100/002147/003164
/001100/002147/003165
/001100/002147/003166
/001100/002147/003167
/001100/002148
/001100/002148/003168
/001100/002148/003169
/001100/002148/003170
/001100/002148/003171
/001100/002148/003172
/001100/002148/003173
/001100/002149
/001100/002149/003174
/001100/002149/003175
/001100/002149/003176
/001100/002149/003177
/001100/002149/003178
/001100/002149/003179
/001100/002149/003179/004326
/001100/002149/003179/004326/005328
/001100/002201
/001100/002201/003202
/001327
/001327/002329
------------------------------------------------------------
 */