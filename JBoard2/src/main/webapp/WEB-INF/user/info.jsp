<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<script src="/JBoard2/js/validation.js"></script>
<jsp:include page="./_header.jsp"/>
<script>
$(function(){
    
	$('.btnNext').click(function(){
		
		console.log('here1 : ' + isPassMatch);
		
		if(isPassMatch){
			console.log('here2');
			let uid = $('input[name=uid]').val();
		    let pass = $('input[name=pass]').val();
			
			let jsonData = {
				"uid": uid,
				"pass": pass
			};
			
			$.ajax({
				url: '/JBoard2/user/info.do',
				type: 'post',
				data: jsonData,
				dataType: 'json',
				success: function(data){
				console.log('here3 : ' + data.result);

					if(pass == pass){
						location.href = "/JBoard2/user/myInfo.do";
					}else{
						alert('비밀번호가 일치하지 않습니다.');
					}
					
				}
			});

</script>
<main id="user">
    <section class="find findId">
        <form action="#">
            <input type="hidden" name="uid" value="${sessUser.uid}"/>
            <table border="0">
                <caption>비밀번호 확인</caption>
                <tr>
                    <td>비밀번호</td>
                    <td><input type="password" name="pass" placeholder="비밀번호 입력"/></td>
                </tr>
            </table>
        </form>
        <p>
            회원님의 정보를 보호하기 위해 비밀번호를 다시 확인합니다.
        </p>

        <div>
            <a href="/JBoard2/user/list.do?uid=${sessUser.uid}" class="btn btnCancel">취소</a>
            <a href="/JBoard2/user/myInfo.do?uid=${sessUser.uid}" class="btn btnNext">다음</a>
        </div>
    </section>
</main>
<jsp:include page="./_footer.jsp"/>