job('DSL-Tutorial-1-Test') {
    description("my first dsl script")
    scm {
        git("https://github.com/Sandeepaws2020/Java_Sample.git",master)
    }
    triggers {
        scm('* * * * *')
    }
    steps {
        maven('clean package','pom.xml')
    }
    publishers{
        archiveArtifacts '**/*.jar'
    }
}