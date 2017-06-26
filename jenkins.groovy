node {
  dir('master') {
    stage('Checkout source') {
      git credentialsId: 'scandihealth-git_lpr3-jenkins-master_github.com', url: 'git@github.com:scandihealth/lpr3-docs.git'
    }
    stage('Build') {
      sh 'mkdocs build --clean'
    }
  }
  sshagent(['scandihealth-git_lpr3-jenkins-master_github.com']) {
    dir('gh-pages') {
      stage('Checkout destination') {
        sh 'git clone git@github.com:scandihealth/lpr3-docs.git'
        sh 'git checkout gh-pages'
        sh 'git pull'
      }
    }
    stage('Collect build results') {
     sh 'cp -r ../master/site/* .' 
    }
    stage('Publish') {
      sh 'git add *'
      sh 'git commit -m "new build"'
      sh 'git push'
    }
  }
}
