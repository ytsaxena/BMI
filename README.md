![aaaa](https://user-images.githubusercontent.com/87789759/193435157-b39991ff-232c-462f-972b-10560b13f88c.jpg) ![Screenshot 2022-10-02 075223](https://user-images.githubusercontent.com/87789759/193435130-a4032efb-c5fb-4995-a945-67be360d8b08.jpg)



It is a simple single screen BMI calculator 
User has to Fill the weight(in Kg)  & Height (in Feet) , (in Inch)

      val totalHeightInch = heightFt * 12 + heightInch  // convert first feet to inches

                    val heightincm = totalHeightInch * 2.54   // convert inches to cm
                    val heightMeter = heightincm / 100           // convert cm to m 

                                                               // use the formula bmi = weight/(heightinmeter*heightinmeter)

                    val bmi = weight / (heightMeter * heightMeter)
                    
                    if  bmi > 25 "You are Fattty"
                        bmi < 18 "You are Skinny"
                   else "You are Fit "
                   
                   
                         
                   
                        
