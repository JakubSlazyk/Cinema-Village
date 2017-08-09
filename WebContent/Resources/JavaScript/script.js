var height=$(".movie").css("height");
$(".player").css("height",height);
$(".player").css("height",height);
$(".player").css("height",height);
$(".player").css("height",height);
$(".player").css("height",height);
$(".player").css("height",height);
$(".player").css("height",height);
$(".player").css("height",height);
$(".player").css("height",height);
$(".player").css("height",height);
// Searching movie script start




$(document).ready(function(){
$("input.movieSearch").on("keyup",function(event){
	var movies=$("div.container div.col-md-3");
	var value=$("input.movieSearch").val().toUpperCase();
	movies.each(function(index){
		console.log("Value:"+value);
		if(this.innerText.toUpperCase().indexOf(value)==-1){
			console.log(this.innerText.toUpperCase());
			this.style.display="none";
			}
		else{
			console.log(this.innerText.toUpperCase());
			this.style.display="inline";
			}
		});
});
});





