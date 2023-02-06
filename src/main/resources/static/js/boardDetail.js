const ClickEvent = (toLocation)=> {
	let checking = window.confirm('해당 게시글을 삭제하시겠습니까?');
	
	if(checking){
		location.href=`/boarddelete/${toLocation}`
		alert('삭제가 완료되었습니다.')
	}
}