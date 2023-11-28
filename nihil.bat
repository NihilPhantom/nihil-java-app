@echo off
set "file=pom.xml"  
set "search=<modules>"  
set "append=        ^<module^>%2^</module^>" 

if "%1"=="install" (
    rem 执行 "pip install" 命令来安装第二个参数指定的包
    echo %2
    git clone https://github.com/NihilPhantom/%2.git
    if not errorlevel 1 (
        echo Git clone completed successfully

        rem 修改 pom 
        setlocal enabledelayedexpansion  
        (for /f "usebackq delims=" %%a in ("%file%") do (  
            set "line=%%a"  
            echo "!line!" | findstr "%search%" >nul &&(
                set "found=1"
                echo.!line!
                echo %append%
            ) || (
                set "output=!output!%%a"
                echo.!line!
            )
        )) > "%file%.new"  
        move "%file%.new" "%file%" >nul

    ) else (
        echo Git clone failed. Please check the repository URL and try again.
    )
) else (
    rem 如果第一个参数不是 "install"，可以在此处添加其他操作
    echo 第一个参数不是 "install"
)