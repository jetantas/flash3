### Flash3

## Maven Project with Github Set up

#1. Open Eclipse => New Maven Project
#2. Org.apache.maven.archetype => maven-archetype-quickstart
#3. Go to https://mvnrepository.com/artifact/org.seleniumhq.selenium
#4. Go to https://testng.org/doc/maven.html
#5. Go to eclipse Marketplace>verify testng installed
#6. Create java package src=>com.georgetantas.demo 
		#test: com.georgetantas.demo.pages
		        #com.georgetantas.demo.business
			#com.georgetantas.demo.regression
#7. Create a Git repo to change the current working directory 
#8. $git init NameProject
#9. $git add .
#10. $git commit -m "First commit"
#11. Create a repo in GitHub
#12. $git remote add origin  <REMOTE_URL> 
#13. $git remote -v
#14. $git push -f origin master

## CI/CD and Setting up a Jenkins job
*********************************************
#1. Code => Commit/Related Code 
#2. CI PIPELINE: Build=>Unit Test>Integration Test
#3. CD PIPELINE: Review=>Staging=>Production
#4. Go To Jenkind => New Item => FreeStyle Project
#5. Build => source ~/.bash_profile / mvn clean
#6. Build => source ~/.bash_profile / mvn test
#7. Go to Build Tiggers => Build periodically
#8. 59 23 * * *
