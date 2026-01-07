export default function Hero(){
    return(
        <section className="text-center py-20 bg-secondary">
            <h2 className="text-5xl font-bold mb-6">
                Turn Words into <span className="text-primary">Ghibli Art</span>
            </h2>

            <p className="text-gray-600 max-w-xl mx-auto mb-8">
               Generate Studio Ghibli–style images using AI. Just type a prompt and watch the magic happen.
            </p>

            <a href="/create" className="bg-primary text-white px-8 py-3 rounder-lg hover:opacity-90">Create Now</a>
        </section>
    );
}