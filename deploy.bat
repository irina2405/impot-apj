@echo off

rem Variable fixe
set "webapps=E:\Program Files\Apache Software Foundation\Tomcat 11.0\webapps"
set "temp=temp"
set "src=src"
set "lib=lib"
set "web=web"
set "xml=conf"
set "classp=lib/*"
set "tempjava=tempJava"

rem Paramètres
set "appName=%1"

if "%appName%"=="" (
    echo Erreur: Veuillez entrer le nom du projet 
    goto :fin
)

if exist "%temp%" (
    rmdir /s /q "%temp%"
)

@REM mkdir "%temp%"
mkdir "%temp%/WEB-INF/lib"
mkdir "%temp%/WEB-INF/classes"

if exist %tempjava% (
    RD /S /Q %tempjava%
)

REM Copier les .java dans un dossier temporaire tempjava
MKDIR %tempjava%
for /R %src% %%G IN (*.java) DO (
    XCOPY /Y "%%G" %tempjava%
)

javac -d "%temp%/WEB-INF/classes" -cp %classp% %tempjava%\*.java

@REM Copy apj.properties to folder
copy "%src%\apj.properties" "%webapps%\%appName%\WEB-INF\classes"

@REM Efface le dossier temporaire après
RD /S /Q %tempjava%

copy "%xml%" "%temp%/WEB-INF/"
copy "%lib%" "%temp%/WEB-INF/lib"
copy "%web%" "%temp%/"

Xcopy "%temp%" "%webapps%\%appName%\" /E /H /C /I /Y

cd %temp%

cd ../%web%

@rem Copy assets to server
Xcopy .\assets "%webapps%\%appName%\assets\" /E /H /C /I /Y

Xcopy .\css "%webapps%\%appName%\css\" /E /H /C /I /Y

Xcopy .\img "%webapps%\%appName%\img\" /E /H /C /I /Y

Xcopy .\js "%webapps%\%appName%\js\" /E /H /C /I /Y

Xcopy .\pages "%webapps%\%appName%\pages\" /E /H /C /I /Y

@REM On supprime le dossier temp
cd ..
rmdir /s /q "%temp%"