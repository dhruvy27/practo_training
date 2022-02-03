
        // targetting function 
        $(document).ready(function(){

           // to get access to the api
            var apikey = "2e03534a2c89f53e2f831fbf51679d65"

            //targetting form by id
            $("#cityform").submit(function(event){
                //prevents auto submission
                event.preventDefault()

                //to store city input
                var city = $("#city").val()

                //variables to store data in respective divs
                var Clouds = ""
                var CoOrd = ""
                var Main = ""
                var Weather = ""
                var Wind ="" 

                //connecting query
                var url = "http://api.openweathermap.org/data/2.5/weather?q="

                $.ajax({
                    method:'GET',
                    url:url+city+"&APPID=2e03534a2c89f53e2f831fbf51679d65",
                    
                    //will retrn the data when the request is succesful
                    success:function(data){

                        console.log(data); 

                        //showing result
                        Clouds = `<h5 style ="text-decoration:underline">Clouds:- </h5></br>
                                  <img src="cloud.jpg" alt="" style="max-width:50%; max-height:50%"></br>
                                  <h6>All:-${data.clouds.all}</h6></br>`;
                        $("#Clouds").html(Clouds)

                        CoOrd = `<h5 style ="text-decoration:underline" >Co-Ordinates</h5></br>
                                <img src="coord.jpg" alt="" style="max-width:50%; max-height:50%"></br>
                                <h6>Longitude:- ${data.coord.lon}</h6></br>
                                <h6>Latitude:- ${data.coord.lat}</h6></br>`;
                        $("#CoOrd").html(CoOrd)
                        
                        Main = `<h5 style ="text-decoration:underline" >Main</h5></br>
                                <img src="main.jpg" alt="" style="max-width:50%; max-height:50%"></br>
                                <h6>Feels Like:- ${data.main.feels_like}</h6></br>
                                <h6>Huidity:- ${data.main.humidity}</h6></br>
                                <h6>Pressure:- ${data.main.pressure}</h6></br>
                                <h6>Temp:- ${data.main.temp}</h6></br>
                                <h6>Min Temp:- ${data.main.temp_max}</h6></br>
                                <h6>Max Temp:- ${data.main.temp_min}</h6></br>`;
                        $("#Main").html(Main)
                        
                        Weather = `<h5  style ="text-decoration:underline">How is the weather:-</h5></br>
                                   <img src="weather.jpg" alt="" style="max-width:50%; max-height:50%"></br>
                                    <h6> ${data.weather[0].description}</h6>`;
                        $("#Weather").html(Weather)
                       
                        Wind = `<h5  style ="text-decoration:underline">Wind<h5></br>
                                <img src="wind.jpg" alt="" style="max-width:50%; max-height:50%"></br>
                                <h6>Deg:- ${data.clouds.all}</h6></br>
                                <h6>Speed:-${data.wind.speed}</h6></br>`;
                        $("#Wind").html(Wind)
                        
                        
                        //console.log(result);

                    } 
                })
            })
        })
    