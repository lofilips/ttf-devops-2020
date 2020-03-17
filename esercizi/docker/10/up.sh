<<<<<<< HEAD
#!/usr/bin/env bash

docker run -p 88:3000 -d serve-js-page-using-node $*
=======
docker container run -p 88:3000 -d serve-js-page-using-node "$*"
>>>>>>> 0396ef2b6501588ea1bb990b0012895dbd8a086d
