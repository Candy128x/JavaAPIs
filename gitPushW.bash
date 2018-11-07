
echo "pingpong"

git add *

echo Write your commit: 

read cmmt

echo You commit: $cmmt

git commit -m "$cmmt </> $(date +"%a, %Y-%m-%d, %H:%M:%S %Z %j")" 

git pull remtjapi brnjapi

git push remtjapi brnjapi 
#git push -f remtjapi brnjapi  

$SHELL