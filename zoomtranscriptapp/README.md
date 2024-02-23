# Zoom Transcript App

## Description
Zoom has a wonderful feature that allows you to see live closed captions. You are able to download the full transcript onto your local machine and read the entire meeting. The problem is that the transcript can be overwheleming because of timestamps and whitespace making it hard to read the file composing of hundreds or thousands of lines. What this program aims to accomplish is to take only the information that matter and stripping the transcript of its timestamps and whitespaces.

## Table of Contents
- [Technologies](#technologies)
- [Features](#features)
- [Usage](#usage)

### Technologies
- Java
- Java.util package
- Ja<span>va.i</span>o package

### Features
- Creates a text file called "info.txt" that contains only the information that was stated during a Zoom meeting. 

### Usage
To correctly use this app, follow these steps:
1. Clone the repository.
```
git clone https://github.com/leetommy3393/smallprojects.git
```
2. Copy this project into the correct Zoom directory.
> I use a Windows 11 Machine and my Zoom directory is at C:\Users\leeto\OneDrive\Documents\Zoom


```
cd smallprojects
cp zoomtranscriptapp [destination]
```

3. Compile the java application.
```
javac ZoomTranscriptApp.java
```
4. Run the application passing in the name of the folder.
```
java ZoomTranscriptApp "2024-02-22 18.36.55 Tommy Lee's Zoom Meeting"
```

The following should output
```
File created: info.txt
```

### Contributors
- Tommy Lee

### Resources
Here are some of the resources I used whilst making this project
- [w3schools](https://www.w3schools.com/java/default.asp)
