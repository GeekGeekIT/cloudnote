//����¼��ť��ӵ����¼�
//�������봰�ڵ�ID�û���count    ID����password
$(function(){

	$("#login").click(function(){
		//�����Ϣ��ʾ
		$("#count_span").html("");
		$("#password_span").html("");
	
	    var v_name = $("#count").val();
	    var v_pwd = $("#password").val();
	    var ok = true;
	    //����û�������Ϣ��ʽ
	    if(v_name == ""){
	    	$("#count_span").html("�û�������Ϊ��");
	    	ok = false;
	    }
	    if(v_pwd == ""){
	    	$("#password_span").html("���벻��Ϊ��");
	    	ok = false;
	    }
	    if(ok){
			checkLogin(v_name,v_pwd);
		}
	});
});
