let formDate = document.getElementById("formUpDate");
let form = document.getElementById("updateForm");
let writer = document.getElementById("writer")
let title = document.getElementById("title")
let content = document.getElementById("contents")



let date = new Date(); //날짜 
let dateInsert = date.toLocaleDateString();
//년월일 

//날짜 세팅
console.log(dateInsert);
//출력확인

formDate.value=`${dateInsert}`;

form.addEventListener('submit',(e)=>{
	if(writer.value===''){	
		alert('작성자를 입력해주세요.');
		e.preventDefault();
	}else if(title.value === ''){
		alert('제목을 입력해주세요.');
		e.preventDefault();
	}else if(content.value === ''){
		alert('내용을 입력해주세요.');	
		e.preventDefault();
	}else{
		alert('수정완료!');
	}
})