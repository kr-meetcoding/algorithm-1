mod bubble_sort;
mod insertion_sort;
mod recursive;
mod selection_sort;

#[cfg(test)]
mod tests {
    #[ctor::ctor]
    fn logger_init() {
        env_logger::init();
    }
}
