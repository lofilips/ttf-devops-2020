<<<<<<< HEAD
FROM node:alpine

COPY package.json /app/
WORKDIR /app
RUN npm install
COPY server.js /app/

EXPOSE 3000

ENTRYPOINT [ "node", "/app/server.js" ]
=======
FROM nodejs:alpine

COPY server.js /app/

COPY package.json /app/

WORKDIR /app/

RUN npm install

ENTRYPOINT ["node", "server.js"]
>>>>>>> 0396ef2b6501588ea1bb990b0012895dbd8a086d
