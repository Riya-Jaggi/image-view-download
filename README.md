# image-view-download

Image View  And Download Is An Easy To Use Library That Helps You To Pass Image Image Url And See Image In Bigger Picture Along With Functionality To Download Image.

How To Use :-\
Step 1:- Add The Dependency to Your Project <br/>
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;implementation 'com.github.Riya-Jaggi:image-view-download:1.0'

Step 2:- Create Intent And Pass Your Image URL And Folder Name To Which You Want The Image To Get Downloaded.      <br/>           
            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;     var intent = Intent(this, GalleryViewActivity::class.java) <br/>  
            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;      intent.putExtra("imageUrl", "https://newevolutiondesigns.com/images/freebies/hd-wallpaper-44.jpg"   ) // URL of your image <br/> 
            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;    intent.putExtra("folderName","Folder") //When Image gets downloaded in your gallery then you can find it under this folder.<br/> 
            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;     startActivity(intent)
         <br/> 
				 <br/> 
				 <br/> <br/> 

![imageGithub](https://user-images.githubusercontent.com/66410696/83737760-101be400-a671-11ea-8bdc-508ea783399a.png)

