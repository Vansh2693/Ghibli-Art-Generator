export default function Features(){
    return(
        <section id="features" className="py-20 px-8">

            <h3 className="text-3xl font-bold text-center mb-12">Features</h3>

            <div className="grid md:grid-cols-3 gap-8">
                {[
                    "Ghibli-style AI Images",
                    "High Resolution Output",
                    "Fast & Secure Generation",
                ].map((feature) =>(
                    <div key={feature} className="bg-white shadow-md p-6 rounder-lg text-center">
                        <h4 className="font-semibold text-lg">{feature}</h4>
                    </div>
                ))}
            </div>
        </section>
    );
}