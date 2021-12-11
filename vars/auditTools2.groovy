def call(Map config) {
  node {
    echo 'test'
    sh '''
       git version
       java --version
    '''      
  }
}
