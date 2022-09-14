job('NodeJS example') {
    scm {
        git('https://github.com/dbansal3/docker-demo.git') {  node -> // is hudson.plugins.git.GitSCM
            node / gitConfigName('dbansal3')
            node / gitConfigEmail('deepanshubansal223@gmail.com')
        }
    }
    triggers {
        scm('H/5 * * * *')
    }
    wrappers {
        nodejs('nodejs') // this is the name of the NodeJS installation in 
                         // Manage Jenkins -> Configure Tools -> NodeJS Installations -> Name
    }
    steps {
        shell("npm install")
    }
}
