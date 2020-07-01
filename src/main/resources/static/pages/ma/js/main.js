//轮播图
var nowKey = 1;
$('.carousel_img[name=1]').show();
$('.icon i[name=1]').css("color", "#f00");
objTime = setInterval(Carousel, 2500);


// 轮播图
function Carousel() {
    var forKey = 1;
    nowKey++;
    //便利img标签
    $('.carousel_img').each(function () {
        //如果已显示
        if (!$(this).is(":hidden") && (nowKey - 1) == forKey) {
            if (nowKey == 4) {
                nowKey = 1;
                $('.carousel_img[name=1]').fadeIn(800);
                console.log(nowKey);
            } else {
                $(this).next('img').fadeIn(800);
            }
            $(this).fadeOut(800);
        }
        forKey++;
    });
    //下面红点跟着幻灯片动
    if (nowKey == 1) {
        $(".icon i[name=1]").css("color", "#f00");
        $(".icon i[name=5]").css("color", "#fff");
    } else {
        $(".icon i[name=" + nowKey + "]").css("color", "#f00");
        $(".icon i[name=" + (nowKey - 1) + "]").css("color", "#fff");
    }
}

//鼠标放在轮播图上面暂停播放
$('.slide').hover(
    function () {
        clearInterval(objTime);
        $('.prevNext').show();
    },
    function () {
        objTime = setInterval(Carousel, 2500);
        $('.prevNext').hide();
    }
);

//点击轮播图的小圆点
$('.icon i').hover(function () {
    //先消失
    tempKey = parseInt($(this).attr("name"));
    $(".icon i[name=" + nowKey + "]").css("color", "#fff");
    //如果选中的和上一个不一样时
    if (tempKey != nowKey)
        $(".carousel_img[name=" + nowKey + "]").fadeOut(800);
    nowKey = tempKey;
    //再出现
    $(this).css("color", "#f00");
    $(".carousel_img[name=" + nowKey + "]").fadeIn(800);
    console.log(nowKey);
}, function () {
});

//点击上一张下一张
function PrevNextClick(flag) {
    if (flag == 1) {
        if (nowKey > 1) {
            $(".icon i[name=" + nowKey + "]").css("color", "#fff");
            $(".carousel_img[name=" + nowKey + "]").fadeOut(800);
            nowKey--;
        }
    } else if (flag == 2) {
        if (nowKey < 3) {
            $(".icon i[name=" + nowKey + "]").css("color", "#fff");
            $(".carousel_img[name=" + nowKey + "]").fadeOut(800);
            nowKey++;
        }
    }
    $(".icon i[name=" + nowKey + "]").css("color", "#f00");
    $(".carousel_img[name=" + nowKey + "]").fadeIn(800);
}