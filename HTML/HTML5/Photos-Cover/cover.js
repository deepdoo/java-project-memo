$(function() {

var images = [
"https://c1.staticflickr.com/1/349/32567553602_5a25c4bcb3_z.jpg",
"https://farm2.static.flickr.com/1614/25374454246_2249c772df_b.jpg",
"https://farm2.static.flickr.com/1582/25288839052_e1a85939e0_b.jpg"
];

function getImage(){
	var i = images.shift();
	images.push(i);
	return i;
}
$(".year").text(new Date().getFullYear());
$('.bg-wrapper').hide();

$('.bg-wrapper').clone().appendTo( "BODY" );
$('BODY .bg-wrapper').last().css('background-image', 'url("'+getImage()+'")');

function anim() {

   // $('.bg-wrapper').fadeOut(5000);
    $('BODY .bg-wrapper').first().fadeOut(2000, function() {
        $(this).css('background-image', 'url("'+getImage()+'")'); 
    });   
    $('BODY .bg-wrapper').first().appendTo('BODY');
    $('BODY .bg-wrapper').first().fadeIn(3000);

//$('.bg-wrapper').hide();
//$('.bg-wrapper').css('background-image', 'url("'+u+'")');
// $('.bg-wrapper').fadeOut(2000, function() {
//        $(this).css('background-image', 'url("'+u+'")').fadeIn(2000); 
//    });
//$('.bg-wrapper').animate({"opacity": 1}, 2000, function() {
//        $(this).css('background-image', 'url("'+getImage()+'")').css("opacity", 0); 
//    });

//$('.bg-wrapper').fadeOut(2000);//.css('background-image', 'url("'+u+'")');
//$('.bg-wrapper').css('background-image', 'url("'+u+'")').fadeIn(2000);    
//$('.bg-wrapper').hide().fadeIn(1000).delay(5000).fadeOut(1000);
    setTimeout(anim, 5000);
/*
$('img').hide();

function anim() {
    $("#wrap img").first().fadeOut(5000);    
    $("#wrap img").first().appendTo('#wrap');
    $("#wrap img").first().fadeIn(5000);    
    setTimeout(anim, 5000);
}
anim();

*/
}

anim();
//setInterval(anim,5000);

});
