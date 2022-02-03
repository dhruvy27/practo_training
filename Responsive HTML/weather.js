
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
                var Temp = ""
                var Weather = ""
                var Wind ="" 
                var Country=""
                var Pressure=""
                var Humidity=""
                var Level=""
                var Timezone=""

                //connecting query
                var url = "http://api.openweathermap.org/data/2.5/weather?q="

                $.ajax({
                    method:'GET',
                    url:url+city+"&APPID=2e03534a2c89f53e2f831fbf51679d65",
                    
                    //will retrn the data when the request is succesful
                    success:function(data){

                        console.log(data); 

                        //showing result

                        Country = `<h5  style ="text-decoration:underline">Country & City<h5></br>
                                    <img src="country.jpg" alt="" style="max-width:50%; max-height:50%"></br>
                                    <h6>Country:- ${data.sys.country}</h6></br>
                                    <h6>City:-${data.name}</h6></br>`;
                         $("#Country").html(Country)

                         CoOrd = `<h5 style ="text-decoration:underline" >Co-Ordinates</h5></br>
                                 <img src="coord.jpg" alt="" style="max-width:50%; max-height:50%"></br>
                                 <h6>Longitude:- ${data.coord.lon}</h6></br>
                                 <h6>Latitude:- ${data.coord.lat}</h6></br>`;
                         $("#CoOrd").html(CoOrd)

                        Clouds = `<h5 style ="text-decoration:underline">Clouds:- </h5></br>
                                  <img src="cloud.jpg" alt="" style="max-width:50%; max-height:50%"></br>
                                  <h6>All:-${data.clouds.all}%</h6></br>`;
                        $("#Clouds").html(Clouds)

                        Temp = `<h5 style ="text-decoration:underline" >Temperature</h5></br>
                                <img src="temp.png" alt="" style="max-width:50%; max-height:50%"></br>
                                <h6>Temp:- ${data.main.temp}</h6></br>
                                <h6>Min Temp:- ${data.main.temp_max}kelvin</h6></br>
                                <h6>Max Temp:- ${data.main.temp_min}kelvin</h6></br>`;
                        $("#Temp").html(Temp)
                        
                        Weather = `<h5  style ="text-decoration:underline">How is the weather:-</h5></br>
                                   <img src="weather.jpg" alt="" style="max-width:50%; max-height:50%"></br>
                                    <h6> ${data.weather[0].description}</h6>`;
                        $("#Weather").html(Weather)
                       
                        Wind = `<h5  style ="text-decoration:underline">Wind<h5></br>
                                <img src="wind.jpg" alt="" style="max-width:50%; max-height:50%"></br>
                                <h6>Deg:- ${data.clouds.all}</h6></br>
                                <h6>Speed:-${data.wind.speed}m/s</h6></br>`;
                        $("#Wind").html(Wind)

                      
                        Pressure = `<h5  style ="text-decoration:underline">Pressure:-</h5></br>
                                   <img src="pressure.png" alt="" style="max-width:50%; max-height:50%"></br>
                                    <h6> ${data.main.pressure}hpa</h6>`;
                        $("#Pressure").html(Pressure)

                        Humidity = `<h5  style ="text-decoration:underline">Humidity:-</h5></br>
                                   <img src="humidity.jpg" alt="" style="max-width:50%; max-height:50%"></br>
                                    <h6> ${data.main.humidity}%</h6>`;
                        $("#Humidity").html(Humidity)

                        Level = `<h5  style ="text-decoration:underline">Sea & Ground Level:-</h5></br>
                                   <img src="level.jpg" alt="" style="max-width:50%; max-height:50%"></br>
                                    <h6>Sea Level:- ${data.main.sea_level}</h6></br>
                                    <h6>Ground Level:- ${data.main.grnd_level}</h6></br>`;
                        $("#Level").html(Level)


                        Timezone = `<h5 style ="text-decoration:underline" >Timezone</h5></br>
                                <img src="timezone.jpg" alt="" style="max-width:50%; max-height:50%"></br>
                                <h6>Timezone:- ${data.timezone}</h6></br>
                                <h6>Sunrise:- ${data.sys.sunrise}</h6></br>
                                <h6>Sunrise:- ${data.sys.sunset}</h6></br>`;
                        $("#Timezone").html(Timezone)
                        
                        //console.log(result);

                    } 
                })
            })
        })
    