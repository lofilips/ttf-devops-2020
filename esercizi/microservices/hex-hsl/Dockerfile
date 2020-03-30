FROM node:alpine

COPY /dist /app/dist

COPY package.json /app

WORKDIR /app/dist/hex-hsl/src/

EXPOSE 3000

CMD ["node", "HttpServer.ts"]