node {
    environment{
    	registry = "shivani96/test"
    	registryCredential = '5bc8ebfc-76b6-42aa-8623-c0a8f3772d54'
    	dockerImage = ''
    	dockerImageLatest = ''
    }

    stage('Clone repository') {
        /* Let's make sure we have the repository cloned to our workspace */

        steps{
        	git 'https://github.com/Shivani-96/calculator-jenkins-integration-sample'
        }
    }

    stage('Build image') {
        /* This builds the actual image; synonymous to
         * docker build on the command line */
		steps{
			script{ 
				dockerImage = docker.build registry + "$:BUILD_NUMBER"
				dockerImageLatest = docker.build registry + ":latest" 
			}
		}
        
    }


    stage('Push image') {
        /* Finally, we'll push the image with two tags:
         * First, the incremental build number from Jenkins
         * Second, the 'latest' tag.
         * Pushing multiple tags is cheap, as all the layers are reused. */
         steps{
         	script{ 
         		docker.withRegistry('https://registry.hub.docker.com', registryCredential) {
            	dockerImage.push("${env.BUILD_NUMBER}")
            	dockerImageLatest.push("latest")
        		}
         	}
         }
       }
}