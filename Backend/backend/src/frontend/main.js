import { ProductsView } from "./views/ProductsView.js";
import { SSEClient } from "./lib/sse-client.js";

async function run(){
    const mySSEClient = new SSEClient("localhost:8080");
    await mySSEClient.connect();
    const productsview = new ProductsView();
    await mySSEClient.subscribe("Channelbid", productsview.updateBid);   
    productsview.displayProducts();
}

window.addEventListener("load", async (event) => {await run();});