package TESTING;

public class login_data {
	public String uid,pwd,exp_re1,act_res1,test_res;
	public String exp_em1,exp_em2,act_em1,act_em2;
	public login_data(String uid, String pwd, String exp_re1, String act_res1, String test_res) {
		super();
		this.uid = uid;
		this.pwd = pwd;
		this.exp_re1 = exp_re1;
		this.act_res1 = act_res1;
		this.test_res = test_res;
	}
	public login_data() {}


public void display() {
	System.out.println("UID:"+this.uid
			+"\nPWD:"+this.pwd
			+"\nEXP_res:"+this.exp_re1
			+"\nACT_RESLT:"+this.act_res1
			+"\ntEST RES:"+this.test_res
			+"\nEXP_ER_1:"+this.exp_em1
			+"\nEXP_ER_2:"+this.exp_em2
			+"\nACT_ER1:"+this.act_em1
			+"\nPACT_ER2:"+this.act_em2);
}

}
