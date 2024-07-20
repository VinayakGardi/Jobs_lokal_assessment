
#  Lokal Assessment 

## Overview
This project is a simple Android application that demonstrates a basic implementation of job listing and bookmarking functionalities using a provided API endpoint. The application includes features such as bookmarking, offline data storage, and a bottom navigation UI.
## Features
- Bottom Navigation: The app provides a bottom navigation UI with two sections: "Jobs" and "Bookmarks".
- Jobs Screen: Fetches job data from the API endpoint and displays it in a list with infinite scrolling. Each job card shows the title, location, salary, and phone information.
- Job Details: Clicking on a job card navigates to a detailed view of the job.
- Bookmark Functionality: Users can bookmark jobs, and these bookmarks are saved in a local database for offline access.
- Offline Storage: All bookmarked jobs are stored in a local Room database.
- State Management: Handles different states such as loading, error, and empty states throughout the app.




## API Endpoint 
The job data is fetched from the following API endpoint:
- URL :  https://testapi.getlokalapp.com/common/jobs?page=1


## Libraries and Tools Used
- Kotlin: Primary programming language
- Retrofit: For making network requests
- Room: For local database storage
- Coroutine: For asynchronous programming
- Navigation Component: For managing app navigation
- Glide/Picasso: For image loading from web
- SmoothBottomBar : 3rd party library to for bottombar

## Video Reference
A video demonstrating the functionality and usage of the app can be found at Your
https://drive.google.com/file/d/1fkt2-f10gLehF3TCiVmUblCkYc429IsC/view?usp=sharing