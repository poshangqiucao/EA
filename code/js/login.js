function chk_image(){
    var img = document.getElementById("pic");
    img.src = "../CodeServlet?id=" + Math.random();
}