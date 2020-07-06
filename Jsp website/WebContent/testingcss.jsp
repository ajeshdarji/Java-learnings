<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <title>CSS website</title> 
        <link rel="stylesheet" href="css/web.css">

    </head>
    <body>
        <nav>
            <ul class="topnav" id="dropdownclick">
                <li><a class="active" href="#home">home</a></li>
                <li><a href="#news">news</a></li>
                <li><a href="#contact">contact</a></li>
                <li><a href="#about">about</a></li>
                <li class="topnav-right"><a href="Register.jsp">signup</a></li>
                <li class="topnav-right"><a href="testingcss.jsp">signin</a></li>
                <li class="dropdownicon"><a href="javascript:void(0);" onclick="dropdownmenu()">&#9776;</a></li>
            </ul>
        </nav>

        <div class="container" id="sec-1-gradient">
         <div class="row">
             <div class="col-6">
                    <div class="leftside-col">
                     <h1 class="large">CRAZY</h1>
                     <h1 class="large">DEVELOPERS</h1>
                 </div>
                 <form action="Login" method="post">
                     <div class="leftside-col">
                         <h2>Username</h2>
                         <input class="inputbox" name="username" type="text" placeholder="username">
                         <h2>password</h2>
                         <input class="inputbox" name="password" type="password" placeholder="password">
                         <button>Login</button>
                     </div>
                 </form>

             </div>
             <div class="col-6">
                <div class="rightside-col">
                    <div class="videocontainer">
                    <iframe width="560" height="315" src="https://www.youtube.com/embed/R83BlU5nnbs" frameborder="0" allow="accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>
                </div>
                </div> 
            </div>
         </div>
        </div>

        <header>
            <h1 class="section2header">GODS OWN COUNTRY</h1>
        </header>
        <div class="container">
            <div class="row">
                <div class="col-4">
                    <div class="box">
                        <div class="icon">
                        <img src="kerala.jpg" width="200" height="100" alt="Country">
                        </div>
                            <label>Chat with us</label>
                            <p>When choosing a perfect holiday destination, customers like to gather as much information as possible. Chatting is a quick and easy way of doing that. Providing information on lodging, prices, pet policy or even the weather may determine if a customer chooses one of your trips</p>
                     </div>
                </div>
                <div class="col-4">
                        <div class="box">
                            <div class="icon">
                            <img src="kerala.jpg" width="200" height="100" alt="Country">
                            </div>
                                <label>Chat with us</label>
                                <p>When choosing a perfect holiday destination, customers like to gather as much information as possible. Chatting is a quick and easy way of doing that. Providing information on lodging, prices, pet policy or even the weather may determine if a customer chooses one of your trips</p>
                         </div>
                    </div>
                    <div class="col-4">
                            <div class="box">
                                <div class="icon">
                                <img src="kerala.jpg" width="200" height="100" alt="Country">
                                </div>
                                    <label>Chat with us</label>
                                    <p>When choosing a perfect holiday destination, customers like to gather as much information as possible. Chatting is a quick and easy way of doing that. Providing information on lodging, prices, pet policy or even the weather may determine if a customer chooses one of your trips</p>
                             </div>
                        </div>
                     </div>
                     <div class="row">
                         <div class="col-5">
                             <button class="learnmore">learn more</button>
                         </div>
                     </div>
        </div>
        <hr>
        <div class="container">
            <div class="row">
            <div class="col-2">
                <article>
                    <P>When choosing a perfect holiday destination, customers like to gather as much information as possible. Chatting is a quick and easy way of doing that. Providing information on lodging, prices, pet policy or even the weather may determine if a customer chooses one of your trips</P>
                </article>
            </div>
            <div class="col-3">
                <div class="slopeicon">
                    <img src="logo.jpg" width="400" height="300" alt="lion">
                </div>
            </div>
        </div>
    </div>
    <footer class="foot">
        <div class="row">
            <div class="col-1 mobile">
                <h1>Company</h1>
                <ul>
                    <li>about</li>
                    <li>services</li>
                    <li>careers</li>
                </ul>

            </div>
            <div class="col-1 mobile">
                    <h1>Company</h1>
                    <ul>
                        <li>about</li>
                        <li>services</li>
                        <li>careers</li>
                    </ul>
    
                </div>
                <div class="col-1 mobile">
                        <h1>Company</h1>
                        <ul>
                            <li>about</li>
                            <li>services</li>
                            <li>careers</li>
                        </ul>
        
                    </div>
                    <div class="col-1 mobile">
                            <h1>Company</h1>
                            <ul>
                                <li>about</li>
                                <li>services</li>
                                <li>careers</li>
                            </ul>
            
                        </div>
        </div>
    </footer>



        <script>
            function dropdownmenu() {
                var x = document.getElementById("dropdownclick");
                if(x.className === "topnav"){
                    x.className += " responsive";
                    }
                    else{
                        x.className = "topnav";
                    }
            }

        </script>
    </body>
</html>