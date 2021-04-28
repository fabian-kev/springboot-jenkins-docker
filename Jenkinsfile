environment {
    DOCKER_ID = "fbiankevin"
}

properties([[$class: 'GithubProjectProperty', displayName: '', projectUrlStr: 'https://github.com/fabian-kev/springboot-jenkins-docker.git/'], pipelineTriggers([pollSCM('* * * * *')])])
node {
    stage('SCM Checkout') {
        git 'https://github.com/fabian-kev/springboot-jenkins-docker.git'
    }
    stage('Gradle Build') {
       def home = tool name: '6.7', type: 'gradle'
       bat "${home}/bin/gradle clean build"
    }

    stage('Docker build image') {
       bat "docker build -t fbiankevin/oasis ."

    }

    stage('Printing out the variables'){
        echo "Commit ${env.GIT_COMMIT}"
          echo "Brancch ${env.BRANCH_NAME}"
    }

    stage('Docker push image'){
        withCredentials([usernamePassword(credentialsId: 'Dockerhub', passwordVariable: 'password', usernameVariable: 'username')]) {
              bat "docker login -u ${username} -p ${password}"

              bat "docker push ${DOCKER_ID}/oasis"
        }
    }
}